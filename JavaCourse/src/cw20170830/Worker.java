package cw20170830;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {

	static final Runnable POISON_PILL = () -> {
	};

	Thread t;

	boolean blocker = false;

	BlockingQueue<Runnable> tasks = new BlockingQueue<>();

	public Worker() {
		t = new Thread(this::processTasks);
		t.start();
	}

	@Override
	public void execute(Runnable command) {
		if (!blocker) {
			tasks.put(command);
		}
	}

	private void processTasks() {
		while (true) {
			Runnable task = tasks.take();
			if (task == POISON_PILL) {
				return;
			}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
	}

	public void shutdown() {
		tasks.put(POISON_PILL);
	}

	public List<Runnable> shutdownNow() {
		List<Runnable> allTasks = new LinkedList<>();
		if (!Thread.interrupted()) {
			Runnable taken = tasks.takeDontProcessedTask();
			while (taken != null) {
				allTasks.add(taken);
				taken = tasks.takeDontProcessedTask();
			}
			t.interrupt();
			tasks.put(POISON_PILL);
		}
		blocker = true;
		return allTasks;
	}
}