package com.cynthia.hello_spring;

import java.time.Instant;
import java.util.UUID;
public record Task(UUID id,String title,boolean done,Instant createdAt) {
}
