package student;

import java.util.Scanner;

public class ScoreList {
	int maxLength = 100;
	int length = 0;
	Score[] data = new Score[maxLength];
	Score classCore = new Score();

	Scanner input = new Scanner(System.in);

	public ScoreList() {

	}
	//�����༶�ܳɼ���Ϊ.txt�ļ�
	public void exportData() {
		
	}
    //����༶�ܳɼ���
	public void transcript() {
        System.out.println("=====================================");
        System.out.println(" ѧ��      ����       ��ѧ�ɼ�       Java�ɼ�       �����ɼ�       �ܳɼ�");
        for (int i = 0; i < length; i++) {
            System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore()+ "\t" + data[i].getJavaScore()+ "\t" + data[i].getSportsScore()+ "\t" + data[i].getAllScore());
        }
        System.out.println("=====================================\n");
        System.out.println("�༶ƽ���ɼ�          "+classCore.getMathScore() + "\t" + "\t" + classCore.getJavaScore() + "\t" + "\t" + classCore.getSportsScore() + "\t" + "\t" + classCore.getAllScore());
        System.out.println("=====================================\n");
    }
	// ���ܳɼ��Ӹ��������򷽷�
		public void sort() {
			Score temp = new Score();// ð������
			for (int i = 1; i < length; i++) {
				for (int j = 0; j < length - i; j++) {
					if (data[j].getAllScore() < data[j + 1].getAllScore()) {
						temp = data[j];
						data[j] = data[j + 1];
						data[j + 1] = temp;
					}

				}
			}
		}
	// ������ѧѧ��
	public void addMath() {
		if (length < maxLength) {
			data[length] = new Score();
			data[length] = new Score();
			System.out.print("������ѧ����ѧ��: ");
			data[length].setNum(input.next());
			System.out.print("������ѧ���ĳ�������: ");
			data[length].setBirthDate(input.next());
			System.out.println("������ѧ�����Ա�:");
			data[length].setGender(input.next());
			System.out.print("������ѧ��������:");
			data[length].setName(input.next());
			System.out.print("������ѧ���ĳɼ�");
			data[length].setMathScore(input.nextDouble());
			length++;
			System.out.println("��ӳɹ�");
		} else {
			System.out.println("���ʧ��");
		}
	}

	// ��ʾ�༶��ѧ�ɼ�������
	public void transcriptMath() {
		System.out.println("=====================================");
		System.out.println(" ѧ��      ����       �ɼ� ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore());
		}
		System.out.println("=====================================\n");
	}

	// ����ѧ�ɼ��Ӹ��������򷽷�
	public void sortMath() {
		Score temp = new Score();// ð������
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (data[j].getMathScore() < data[j + 1].getMathScore()) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}

			}
		}
	}

	// �༶ƽ����
	public void averageMath() {
		double sum = 0.0;
		double max = 0.0;
		double min = 100.0;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();// ��Ŀ���㷨
			max = max > data[i].getMathScore() ? max : data[i].getMathScore();
			min = min < data[i].getMathScore() ? min : data[i].getMathScore();
		}
		System.out.printf("���ſε�ƽ���ɼ�Ϊ: %.2f\n", sum / length);
		System.out.println("��߷�Ϊ: " + max + "\n" + "��ͷ�Ϊ: " + min + "\n");
	}

	// ɾ��ѧ����ѧ�ɼ��ķ���
	public void deleteMath() {
		System.out.print("��������Ҫɾ����Ϣ��ѧ����ѧ��: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ��������� \n");
			deleteMath();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("ɾ���ɹ�! \n");
			length -= 1; // ����1 �ᱨ����Խ��Ĵ���
		}
	}

	// ��ѯĳ��ѧ����ѧ�ɼ��ķ���
	public void inquireMath() {
		System.out.print("��������Ҫ��ѯ��ѧ����ѧ��:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("ѧ��                      ����                      ��ѧ�ɼ� ");
				System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ�� \n");
			inquireMath();
		}
	}

	// �޸�ѧ����ѧ�ɼ��ķ���
	public void recomposeMath() {
		System.out.print("��������Ҫ�޸���Ϣ��ѧ����ѧ��");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("�������ѧ���µĳɼ�");
				data[i].setMathScore(input.nextDouble());
				System.out.println("�޸ĳɹ�");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ��\n");
			recomposeMath();
		}
	}

	// ����Javaѧ��
	// ���ѧ��Java�ɼ��ķ���
	public void addJava() {
		if (length < maxLength) {
			data[length] = new Score();
			System.out.print("������ѧ����ѧ��: ");
			data[length].setNum(input.next());
			System.out.print("������ѧ���ĳ�������: ");
			data[length].setBirthDate(input.next());
			System.out.println("������ѧ�����Ա�:");
			data[length].setGender(input.next());
			System.out.print("������ѧ��������:");
			data[length].setName(input.next());
			System.out.print("������ѧ���ĳɼ�");
			data[length].setJavaScore(input.nextDouble());
			length++;
			System.out.println("��ӳɹ�");
		} else {
			System.out.println("���ʧ��");
		}
	}

	// ��ʾ�༶Java�ɼ����ķ���
	public void transcriptJava() {
		System.out.println("=====================================");
		System.out.println(" ѧ��      ����       �ɼ� ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getJavaScore());
		}
		System.out.println("=====================================\n");
	}

	// ��Java�ɼ��Ӹ��������򷽷�
	public void sortJava() {
		Score temp = new Score();// ð������
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (data[j].getMathScore() < data[j + 1].getMathScore()) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}

			}
		}
	}

	// Javaƽ���ַ���
	public void averageJava() {
		double sum = 0.0;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();
		}
		System.out.printf("���ſε�ƽ���ɼ�Ϊ: %.2f\n", sum / length);
	}

	// ɾ��ѧ��Java�ɼ�
	public void deleteJava() {
		System.out.print("��������Ҫɾ����Ϣ��ѧ����ѧ��: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ��������� \n");
			deleteJava();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("ɾ���ɹ�! \n");
			length -= 1; // ����1 �ᱨ����Խ��Ĵ���
		}
	}

	// ��ѯĳ��ѧ��Java�ɼ�
	public void inquireJava() {
		System.out.print("��������Ҫ��ѯ��ѧ����ѧ��:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("ѧ��                      ����                       Java�ɼ�");
				System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getJavaScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ�� \n");
			inquireJava();
		}
	}

	// �޸�ѧ��Java�ɼ��ķ���
	public void recomposeJava() {
		System.out.print("��������Ҫ�޸���Ϣ��ѧ����ѧ��");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("�������ѧ���µĳɼ�");
				data[i].setJavaScore(input.nextDouble());
				System.out.println("�޸ĳɹ�");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ��\n");
			recomposeJava();
		}
	}

	// ��������ѧ��
	// ���ĳ��ѧ�������ɼ��ķ���
	public void addSports() {
		if (length < maxLength) {
			data[length] = new Score();
			data[length] = new Score();
			System.out.print("������ѧ����ѧ��: ");
			data[length].setNum(input.next());
			System.out.print("������ѧ���ĳ�������: ");
			data[length].setBirthDate(input.next());
			System.out.println("������ѧ�����Ա�:");
			data[length].setGender(input.next());
			System.out.print("������ѧ��������:");
			data[length].setName(input.next());
			System.out.print("������ѧ���ĳɼ�");
			data[length].setSportsScore(input.nextDouble());
			length++;
			System.out.println("��ӳɹ�");
		} else {
			System.out.println("���ʧ��");
		}
	}

	// ��ʾ�༶������Ŀ�ɼ�������
	public void transcriptSports() {
		System.out.println("=====================================");
		System.out.println(" ѧ��      ����       �ɼ� ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getSportsScore());
		}
		System.out.println("=====================================\n");
	}

	// �������ɼ��Ӹ��������򷽷�
	public void sortSports() {
		Score temp = new Score();// ð������
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (data[j].getSportsScore() < data[j + 1].getSportsScore()) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}

			}
		}
	}

	// �༶����ƽ����
	public void averageSports() {
		double sum = 0.00;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();
		}
		System.out.printf("���ſε�ƽ���ɼ�Ϊ: %.2f\n", sum / length);
	}

	// ɾ��ѧ�������ɼ�
	public void deleteSports() {
		System.out.print("��������Ҫɾ����Ϣ��ѧ����ѧ��: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ��������� \n");
			deleteSports();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("ɾ���ɹ�! \n");
			length -= 1; // ����1 �ᱨ����Խ��Ĵ���
		}
	}

	// ��ѯĳ��ѧ�������ɼ��ķ���
	public void inquireSports() {
		System.out.print("��������Ҫ��ѯ��ѧ����ѧ��:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("ѧ��                      ����                      �����ɼ� ");
				System.out
						.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getSportsScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ�� \n");
			inquireSports();
		}
	}

	// �޸�ѧ�������ɼ��ķ���
	public void recomposeSports() {
		System.out.print("��������Ҫ�޸���Ϣ��ѧ����ѧ��");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("�������ѧ���³ɼ�");
				data[i].setSportsScore(input.nextDouble());
				System.out.println("�޸ĳɹ�");
				break;
			}
		}
		if (i == length) {
			System.out.println("���޴���!��˶Ժ���������ѧ��\n");
			recomposeSports();
		}
	}
}
