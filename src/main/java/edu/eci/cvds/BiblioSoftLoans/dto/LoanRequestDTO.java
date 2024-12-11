package edu.eci.cvds.BiblioSoftLoans.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@Data
public class LoanRequestDTO {
    private String studentId;
    private String copyId;
}
