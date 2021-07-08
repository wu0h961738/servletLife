package com.presentation.servletPrac.model;

import lombok.Data;

import java.util.List;

@Data
public class TattooRq {

    private List<String> attributes;

    private String filter;
}
