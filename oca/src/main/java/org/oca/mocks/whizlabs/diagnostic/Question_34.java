package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_34 {

    public static void main(String[] args) {
        StaffMember staffMember_01 = new StaffMember("Max", StaffMember.Facultad.BUSINESS, StaffMember.Gender.MALE);
        StaffMember staffMember_02 = new StaffMember("JOse", StaffMember.Facultad.ENGINEER, StaffMember.Gender.FEMALE);
        StaffMember staffMember_03 = new StaffMember("Marco", StaffMember.Facultad.BUSINESS, StaffMember.Gender.FEMALE);
        StaffMember staffMember_04 = new StaffMember("Pedro", StaffMember.Facultad.ENGINEER, StaffMember.Gender.MALE);
        StaffMember staffMember_05 = new StaffMember("Lorena", StaffMember.Facultad.BUSINESS, StaffMember.Gender.FEMALE);
        StaffMember staffMember_06 = new StaffMember("Marita", StaffMember.Facultad.ENGINEER, StaffMember.Gender.MALE);

        List<StaffMember> staffMemberList = Arrays.asList(staffMember_01, staffMember_02, staffMember_03, staffMember_04, staffMember_05, staffMember_06);

        Map<StaffMember.Gender, Map<StaffMember.Facultad, List<StaffMember>>> fullMapWithData = null;

        fullMapWithData = staffMemberList.stream().collect(Collectors.groupingBy(StaffMember::getGender, Collectors.groupingBy(StaffMember::getFacultad)));

        System.out.println(fullMapWithData);
    }
}

class StaffMember{

    private String name;
    private Facultad facultad;
    private Gender gender;

    public StaffMember(String name, Facultad facultad, Gender gender) {
        this.name = name;
        this.facultad = facultad;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                ", facultad=" + facultad +
                ", gender=" + gender +
                '}';
    }

    enum Facultad{
        BUSINESS,ENGINEER
    }

    enum Gender{
        MALE, FEMALE
    }
}