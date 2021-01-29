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
	//导出班级总成绩表为.txt文件
	public void exportData() {
		
	}
    //输出班级总成绩表
	public void transcript() {
        System.out.println("=====================================");
        System.out.println(" 学号      姓名       数学成绩       Java成绩       体育成绩       总成绩");
        for (int i = 0; i < length; i++) {
            System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore()+ "\t" + data[i].getJavaScore()+ "\t" + data[i].getSportsScore()+ "\t" + data[i].getAllScore());
        }
        System.out.println("=====================================\n");
        System.out.println("班级平均成绩          "+classCore.getMathScore() + "\t" + "\t" + classCore.getJavaScore() + "\t" + "\t" + classCore.getSportsScore() + "\t" + "\t" + classCore.getAllScore());
        System.out.println("=====================================\n");
    }
	// 按总成绩从高往低排序方法
		public void sort() {
			Score temp = new Score();// 冒泡排序法
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
	// 操作数学学科
	public void addMath() {
		if (length < maxLength) {
			data[length] = new Score();
			data[length] = new Score();
			System.out.print("请输入学生的学号: ");
			data[length].setNum(input.next());
			System.out.print("请输入学生的出生日期: ");
			data[length].setBirthDate(input.next());
			System.out.println("请输入学生的性别:");
			data[length].setGender(input.next());
			System.out.print("请输入学生的姓名:");
			data[length].setName(input.next());
			System.out.print("请输入学生的成绩");
			data[length].setMathScore(input.nextDouble());
			length++;
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	// 显示班级数学成绩单方法
	public void transcriptMath() {
		System.out.println("=====================================");
		System.out.println(" 学号      姓名       成绩 ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore());
		}
		System.out.println("=====================================\n");
	}

	// 按数学成绩从高往低排序方法
	public void sortMath() {
		Score temp = new Score();// 冒泡排序法
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

	// 班级平均分
	public void averageMath() {
		double sum = 0.0;
		double max = 0.0;
		double min = 100.0;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();// 三目运算法
			max = max > data[i].getMathScore() ? max : data[i].getMathScore();
			min = min < data[i].getMathScore() ? min : data[i].getMathScore();
		}
		System.out.printf("这门课的平均成绩为: %.2f\n", sum / length);
		System.out.println("最高分为: " + max + "\n" + "最低分为: " + min + "\n");
	}

	// 删除学生数学成绩的方法
	public void deleteMath() {
		System.out.print("请输入您要删除信息的学生的学号: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入 \n");
			deleteMath();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("删除成功! \n");
			length -= 1; // 不减1 会报数组越界的错误
		}
	}

	// 查询某个学生数学成绩的方法
	public void inquireMath() {
		System.out.print("请输入您要查询的学生的学号:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("学号                      姓名                      数学成绩 ");
				System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getMathScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号 \n");
			inquireMath();
		}
	}

	// 修改学生数学成绩的方法
	public void recomposeMath() {
		System.out.print("请输入您要修改信息的学生的学号");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("请输入该学生新的成绩");
				data[i].setMathScore(input.nextDouble());
				System.out.println("修改成功");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号\n");
			recomposeMath();
		}
	}

	// 操作Java学科
	// 添加学生Java成绩的方法
	public void addJava() {
		if (length < maxLength) {
			data[length] = new Score();
			System.out.print("请输入学生的学号: ");
			data[length].setNum(input.next());
			System.out.print("请输入学生的出生日期: ");
			data[length].setBirthDate(input.next());
			System.out.println("请输入学生的性别:");
			data[length].setGender(input.next());
			System.out.print("请输入学生的姓名:");
			data[length].setName(input.next());
			System.out.print("请输入学生的成绩");
			data[length].setJavaScore(input.nextDouble());
			length++;
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	// 显示班级Java成绩单的方法
	public void transcriptJava() {
		System.out.println("=====================================");
		System.out.println(" 学号      姓名       成绩 ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getJavaScore());
		}
		System.out.println("=====================================\n");
	}

	// 按Java成绩从高往低排序方法
	public void sortJava() {
		Score temp = new Score();// 冒泡排序法
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

	// Java平均分方法
	public void averageJava() {
		double sum = 0.0;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();
		}
		System.out.printf("这门课的平均成绩为: %.2f\n", sum / length);
	}

	// 删除学生Java成绩
	public void deleteJava() {
		System.out.print("请输入您要删除信息的学生的学号: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入 \n");
			deleteJava();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("删除成功! \n");
			length -= 1; // 不减1 会报数组越界的错误
		}
	}

	// 查询某个学生Java成绩
	public void inquireJava() {
		System.out.print("请输入您要查询的学生的学号:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("学号                      姓名                       Java成绩");
				System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getJavaScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号 \n");
			inquireJava();
		}
	}

	// 修改学生Java成绩的方法
	public void recomposeJava() {
		System.out.print("请输入您要修改信息的学生的学号");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("请输入该学生新的成绩");
				data[i].setJavaScore(input.nextDouble());
				System.out.println("修改成功");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号\n");
			recomposeJava();
		}
	}

	// 操作体育学科
	// 添加某个学生体育成绩的方法
	public void addSports() {
		if (length < maxLength) {
			data[length] = new Score();
			data[length] = new Score();
			System.out.print("请输入学生的学号: ");
			data[length].setNum(input.next());
			System.out.print("请输入学生的出生日期: ");
			data[length].setBirthDate(input.next());
			System.out.println("请输入学生的性别:");
			data[length].setGender(input.next());
			System.out.print("请输入学生的姓名:");
			data[length].setName(input.next());
			System.out.print("请输入学生的成绩");
			data[length].setSportsScore(input.nextDouble());
			length++;
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	// 显示班级体育科目成绩单方法
	public void transcriptSports() {
		System.out.println("=====================================");
		System.out.println(" 学号      姓名       成绩 ");
		for (int i = 0; i < length; i++) {
			System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getSportsScore());
		}
		System.out.println("=====================================\n");
	}

	// 按体育成绩从高往低排序方法
	public void sortSports() {
		Score temp = new Score();// 冒泡排序法
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

	// 班级体育平均分
	public void averageSports() {
		double sum = 0.00;
		for (int i = 0; i < length; i++) {
			sum += data[i].getJavaScore();
		}
		System.out.printf("这门课的平均成绩为: %.2f\n", sum / length);
	}

	// 删除学生体育成绩
	public void deleteSports() {
		System.out.print("请输入您要删除信息的学生的学号: ");
		String number1 = input.next();
		int i, flag = length;
		for (i = 0; i < length; i++) {
			if (number1.equals(data[i].getNum())) {
				flag = i;
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入 \n");
			deleteSports();
		} else {
			for (int j = flag; j < length; j++) {
				data[j] = data[j + 1];
			}
			System.out.println("删除成功! \n");
			length -= 1; // 不减1 会报数组越界的错误
		}
	}

	// 查询某个学生体育成绩的方法
	public void inquireSports() {
		System.out.print("请输入您要查询的学生的学号:");
		String number2 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number2.equals(data[i].getNum())) {
				System.out.println("====================================");
				System.out.println("学号                      姓名                      体育成绩 ");
				System.out
						.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getSportsScore());
				System.out.println("====================================\n");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号 \n");
			inquireSports();
		}
	}

	// 修改学生体育成绩的方法
	public void recomposeSports() {
		System.out.print("请输入您要修改信息的学生的学号");
		String number3 = input.next();
		int i;
		for (i = 0; i < length; i++) {
			if (number3.equals(data[i].getNum())) {
				System.out.println("请输入该学生新成绩");
				data[i].setSportsScore(input.nextDouble());
				System.out.println("修改成功");
				break;
			}
		}
		if (i == length) {
			System.out.println("查无此人!请核对后重新输入学号\n");
			recomposeSports();
		}
	}
}
