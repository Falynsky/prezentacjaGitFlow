package fal;

public class Main {

    public static void main(String[] args) throws Exception {
        Recruitment recruitment = new Recruitment();

        recruitment.recruit();
        recruitment.fire("ALL");
        recruitment.fire("ALL");
        recruitment.recruit();
    }

}
