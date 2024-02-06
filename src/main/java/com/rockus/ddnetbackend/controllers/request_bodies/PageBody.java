package com.rockus.ddnetbackend.controllers.request_bodies;

import lombok.Getter;

@Getter
public class PageBody {
    private int pageNumber;
    private int pageSize;
}