package student;

public class Score {
    private String num;          //ѧ��
    private String gender;       //�Ա�
    private String birthDate;    //��������
    private String name;         //����
    private double mathScore;    //��ѧ�ɼ�
    private double javaScore;	 //Java�ɼ�
    private double sportsScore;	 //�����ɼ�
    private double allScore;     //�ܳɼ�
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
