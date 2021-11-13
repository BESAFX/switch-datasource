package com.besafx.app.switchdatasource.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Data
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "switchDatasource")
    private SwitchDatasource switchDatasource;
}
