package fr.miage.m1.big_data_m1_23_24.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Table;

import org.springframework.data.annotation.Id;
import lombok.*;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class League {

    @Id
    @PrimaryKey
    private UUID id;

    private String name;

    private String type;

}
