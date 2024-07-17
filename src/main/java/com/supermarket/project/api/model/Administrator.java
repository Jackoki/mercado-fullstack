package com.supermarket.project.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Administrator")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Administrator extends User {
    private Integer permissionLevel;
}