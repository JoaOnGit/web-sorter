package com.sorter.websorter.model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResponseModel(String speed, String algorithm, String sorted) {
}

