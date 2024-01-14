package br.com.treinaweb.javaOOP.classes;

public class animal {
	private String name;
	protected static String typeAnimal;
	private String nickname;
	private int age;
	private String personality;
	private float amountFood;
	private int steps;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public  static String getTypeAnimal() {
		return typeAnimal;
	}
	public String getNickname(){
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public float getAmountFood() {
		return amountFood;
	}
	public int getSteps() {
		return steps;
	}
	
	public void insertFood(float amount) {
		amountFood += amount;
	}
	public void insertSteps(int steps) {
		this.steps+=steps;
	}
}
