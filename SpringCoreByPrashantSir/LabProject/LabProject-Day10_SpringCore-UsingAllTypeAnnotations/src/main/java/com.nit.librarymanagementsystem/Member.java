package com.nit.librarymanagementsystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private int memberId;
    private String memberName;

    public void displayMember() {

        System.out.println("Member Details");
        System.out.println("Member Id : " + memberId);
        System.out.println("Member Name : " + memberName);
    }
}
