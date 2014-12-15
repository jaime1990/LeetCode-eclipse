package com.leetcode.SingleNumber2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,2,2,3,3};
		System.out.println(singleNumber(A));
	}
	/**
	 * �����Ǵ��⿴��д�ģ��Ǹ���λ�߼�����ʵ�����벻���������Ŵ𰸻��ǿ��˰������ǿ������
	 * discuss���и���д����ֵ��ͦӵ�еģ����ǿ�ϧ����û�п���
	 * ��Ҫ��˼·����ones��twos��λ����ʾ����״̬����11ʱ�Զ���Ϊ00�����ʣ�µ�ones��ΪҪ����Ǹ�����
	 * @param A
	 * @return
	 */
	public static int singleNumber(int[] A){
		int ones=0,twos=0,threes=0;
		for(int i=0;i<A.length;i++){
			twos |= ones & A[i];
			ones ^= A[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}
	
}
