package sec05.exam05;

public class SystemEnvExample {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME"); //System.getenv(환경변수) : 환경변수의 값 리턴
        System.out.println("JAVA_HOME: " + javaHome);
    }
}
