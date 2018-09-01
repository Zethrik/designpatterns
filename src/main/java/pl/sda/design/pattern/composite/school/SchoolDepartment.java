package pl.sda.design.pattern.composite.school;

import java.util.ArrayList;
import java.util.Collection;

public class SchoolDepartment implements SchoolUnit {

    private Collection<SchoolUnit> schoolUnits;
    private String schoolDepartmentName;

    public SchoolDepartment(String schoolDepartmentName) {
        this.schoolUnits = new ArrayList<>();
        this.schoolDepartmentName = schoolDepartmentName;
    }

    public void addSchoolUnit (SchoolUnit schoolUnit){
        schoolUnits.add(schoolUnit);
    }

    @Override
    public int kidsInClass() {
        return schoolUnits.stream()
                .mapToInt(SchoolUnit::kidsInClass)
                .sum();
    }
}
