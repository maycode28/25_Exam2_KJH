package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lastId=0;
        List<Motivation> motivations =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String cmd;
        System.out.println("== 명언 앱 실행 ==");
        while(true){
            System.out.print("명령어 ) ");
            cmd=sc.nextLine();
            if(cmd.equals("등록")){
                int id=++lastId;
                System.out.print("명언 : ");
                String content=sc.nextLine();
                System.out.print("작가 : ");
                String author=sc.nextLine();
                Motivation motivation=new Motivation(id,content,author);
                motivations.add(motivation);
                System.out.printf("%d번 명언이 등록되었습니다.\n",id);

            } else if (cmd.equals("목록")) {
                System.out.println("번호   /   작가   /   명언");
                System.out.println("=".repeat(30));
                for(int i=motivations.size()-1;i>=0;i--){
                    Motivation motivation = motivations.get(i);
                    System.out.printf("%d   /   %s   /   %s\n",motivation.getId(),motivation.getAuthor(),motivation.getContent());
                }
            } else if (cmd.equals("종료")) {
                break;
            } else {
                System.out.println("올바른 명령어를 입력해주세요");
            }

        }
        System.out.println("== 명언 앱 종료 ==");
    }
}