package student;

import java.util.Scanner;

public class UI{
	public static void main(String[] args) {
		mainUi();
		
	}

	@SuppressWarnings({ "resource" })
	private static void mainUi() {
		Scanner input = new Scanner(System.in);
		String choice = "1";
		@SuppressWarnings("unused")
		int subject = 0;
		System.out.println("**********学生成绩管理系统********");
		while (choice.equals("0") == false) {
			System.out.println("请选择您需要的查看的学科");
			System.out.println("1.数学");
			System.out.println("2.Java");
			System.out.println("3.体育");
			System.out.println("0.退出程序");
			choice = input.next();

			switch (choice) {
			case "1":
				subjectUi(1);
				break;
			case "2":
				subjectUi(2);
				break;
			case "3":
				subjectUi(3);
				break;
			case "0":
				System.out.println("感谢您使用该系统！");
				System.exit(0);
			}
		}
	}

	private static void subjectUi(int subject) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String choice = "1";
		ScoreList studentScoreList = new ScoreList();
		while (choice.equals("0") == false) {
			System.out.println("1.按总成绩由高到低排序并输出班级成绩单");
			System.out.println("2.添加某学生的该科成绩");
			System.out.println("3.修改某学生的该科成绩");
			System.out.println("4.删除某学生的该科成绩");
			System.out.println("5.查看某学生的该科成绩");
			System.out.println("6.查看该科班级平均分");
			System.out.println("7.按该科成绩由高到低排序并输出班级成绩单");
			System.out.println("8.导出班级成绩单为txt文件");
			System.out.println("9.查看班级总成绩单");
			System.out.println("0.返回科目选择");
			System.out.print("Enter your choice: ");
			choice = input.next();

			switch (choice) {
			case "0":
				mainUi();
				break;

			case "1":
				studentScoreList.sort();
				studentScoreList.transcript();
				System.out.println("请问您还需要什么服务\n");
				break;
			case "2":
				int i = 1;
				do {
					// studentScoreList.addScore(studentScoreList, subject);
					switch (subject) {
					case 1:
						studentScoreList.addMath();
						break;
					case 2:
						studentScoreList.addJava();
						break;
					case 3:
						studentScoreList.addSports();
						break;
					default:
						System.out.println("Error!");
						break;
					}
					System.out.println("\n是否继续添加?" + "\n" + "0.否" + "\n" + "1.是");
					i = input.nextInt();
				} while (i == 1);
				System.out.println("请问您还需要什么服务?\n");
				break;

			case "3":
				switch (subject) {
				case 1:
					studentScoreList.recomposeMath();
					break;
				case 2:
					studentScoreList.recomposeJava();
					break;
				case 3:
					studentScoreList.recomposeSports();
					break;

				}
				System.out.println("请问您还需要什么服务?\n");
				break;

			case "4":
				switch (subject) {
				case 1:
					studentScoreList.deleteMath();
					break;
				case 2:
					studentScoreList.deleteJava();
					break;
				case 3:
					studentScoreList.deleteSports();
					break;
				}

				System.out.println("请问您还需要什么服务?\n");
				break;

			case "5":
				switch (subject) {
				case 1:
					studentScoreList.inquireMath();
					break;
				case 2:
					studentScoreList.inquireJava();
					break;
				case 3:
					studentScoreList.inquireSports();
					break;
				}

				System.out.println("请问您还需要什么服务?\n");
				break;

			case "6":
				switch (subject) {
				case 1:
					studentScoreList.averageMath();
					break;
				case 2:
					studentScoreList.averageJava();
					break;
				case 3:
					studentScoreList.averageSports();
					break;
				}

				System.out.println("请问您还需要什么服务?\n");
				break;

			case "7":
				switch (subject) {
				case 1:
					studentScoreList.sortMath();
					studentScoreList.transcriptMath();
					break;
				case 2:
					studentScoreList.sortJava();
					studentScoreList.transcriptJava();
					break;
				case 3:
					studentScoreList.sortSports();
					studentScoreList.transcriptSports();
					break;
				}
				System.out.println("请问您还需要什么服务?\n");
				break;
			case "8":
				studentScoreList.exportData();
				System.out.println("请问您还需要什么服务\n");
				break;
			case "9":
				studentScoreList.transcript();
				System.out.println("请问您还需要什么服务\n");
				break;

			default:
				System.out.println("Invalid input! Please enter again.");
				break;
			}
		}
	}
}
