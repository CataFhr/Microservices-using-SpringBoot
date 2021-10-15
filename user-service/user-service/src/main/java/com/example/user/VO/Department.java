package com.example.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String departmentId;

    private String getDepartmentName;

    private String departmentAdress;

    private String departmentCode;

}
