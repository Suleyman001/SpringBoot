package org.example.suleyman;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class StringToTimestampConverter implements Converter<String, Timestamp> {
    @Override
    public Timestamp convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }
        LocalDateTime localDateTime = LocalDateTime.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
        return Timestamp.valueOf(localDateTime);
    }
}
