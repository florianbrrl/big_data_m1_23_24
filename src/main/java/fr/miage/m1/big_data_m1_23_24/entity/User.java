package fr.miage.m1.big_data_m1_23_24.entity;

import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    private Long id;

    private String firstname;

    private String lastname;
}
