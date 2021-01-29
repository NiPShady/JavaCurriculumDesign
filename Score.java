package student;

public class Score {
    private String num;          //学号
    private String gender;       //性别
    private String birthDate;    //出生日期
    private String name;         //姓名
    private double mathScore;    //数学成绩
    private double javaScore;	 //Java成绩
    private double sportsScore;	 //体育成绩
    private double allScore;     //总成绩
    public Score() {

    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathScore(double score) {
        this.mathScore = score;
    }
    public void setJavaScore(double score) {
        this.javaScore = score;
    }
    public void setSportsScore(double score) {
        this.sportsScore = score;
    }
    public void setGender(String gender) {
    	this.gender=gender;
    }
    public void setBirthDate(String birthDate) {
    	this.birthDate=birthDate;
    }
    public String getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
    public double getMathScore() {
        return mathScore;
    }
    public double getJavaScore() {
        return javaScore;
    }
    public double getSportsScore() {
        return sportsScore;
    }
    public double getAllScore() {
    	return mathScore+javaScore+sportsScore;
    }
}
