package cw20170712;

// ����������� ������
// ������ �������� - ������ ��������
// ���������� ���� �� ���������
public class OldApproach {
	static class Stack {
		String[] elements;
		int size;
	}
	
	public static boolean push(Stack stack, String value){
		if (stack.size>=stack.elements.length){
			return false;
		}
		stack.elements[stack.size++] = value;
		return true;
	}
}
