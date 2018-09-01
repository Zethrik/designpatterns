package pl.sda.design.pattern.composite;

import org.junit.Test;
import pl.sda.design.pattern.composite.school.SchoolClass;
import pl.sda.design.pattern.composite.school.SchoolDepartment;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SchoolDepartmentTest {

    @Test
    public void testSummingKidsInSchool() {
        SchoolClass preschool = new SchoolClass(15, "Krasnoludki");
        SchoolClass firstClass = new SchoolClass(17, "1 klasa");
        SchoolClass secondClass = new SchoolClass(18, "2 klasa");
        SchoolClass fourthClass = new SchoolClass(20, "4 klasa");
        SchoolClass fifthClass = new SchoolClass(20, "5 klasa");

        SchoolDepartment primarySchool = new SchoolDepartment("Szkoła podstawowa");
        SchoolDepartment firstPart = new SchoolDepartment("Klasy 1-3");
        SchoolDepartment secondPart = new SchoolDepartment("Klasy 4-8");
        firstPart.addSchoolUnit(firstClass);
        firstPart.addSchoolUnit(secondClass);
        secondPart.addSchoolUnit(fourthClass);
        secondPart.addSchoolUnit(fifthClass);
        primarySchool.addSchoolUnit(firstPart);
        primarySchool.addSchoolUnit(secondPart);

        SchoolDepartment wholeSchool = new SchoolDepartment("Zespół szkolno-przedszkolny");
        wholeSchool.addSchoolUnit(preschool);
        wholeSchool.addSchoolUnit(primarySchool);

        assertThat(wholeSchool.kidsInClass(), equalTo(90));
    }
}
