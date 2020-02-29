package fal;

public class Main {

    public static void main(String[] args) throws Exception {
        Recruitment recruitment = new Recruitment();

        recruitment.recruit();
        recruitment.fireAll();
        recruitment.fireAll();
        recruitment.recruit();
    }

}
