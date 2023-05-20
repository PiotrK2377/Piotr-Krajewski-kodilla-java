package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int idNumberUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberPublicationPost;

    public ForumUser(int idNumberUser, String nameUser, char sex, int birthYear, int birthMonth, int birthDay, int numberPublicationPost) {
        this.idNumberUser = idNumberUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
        this.numberPublicationPost = numberPublicationPost;
    }

    public int getIdNumberUser() {
        return idNumberUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberPublicationPost() {
        return numberPublicationPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumberUser = " + idNumberUser +
                ", nameUser ='" + nameUser + '\'' +
                ", sex = " + sex +
                ", birthDate = " + birthDate +
                ", numberPublicationPost = " + numberPublicationPost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return idNumberUser == forumUser.idNumberUser && sex == forumUser.sex && numberPublicationPost == forumUser.numberPublicationPost && Objects.equals(nameUser, forumUser.nameUser) && Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumberUser, nameUser, sex, birthDate, numberPublicationPost);
    }
}
