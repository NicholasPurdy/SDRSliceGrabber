package net.nicholaspurdy.sdrslicegrabber.utils;

import org.springframework.batch.core.JobExecution;

import java.io.File;
import java.time.Duration;
import java.time.Instant;

public final class FormatUtils {

    public static String getTimeStr(JobExecution jobExecution) {

        return getStr((jobExecution.getEndTime().getTime() - jobExecution.getStartTime().getTime()) / 1000);

    }

    public static String getTimeStr(Instant start, Instant end) {

        return getStr(Duration.between(start, end).getSeconds());

    }

    private static String getStr(long seconds) {

        StringBuilder builder = new StringBuilder();

        if (seconds / 60 >= 1) {
            if (seconds / 60 >= 60) {
                return builder.append(seconds / 60 / 60).append(" HOURS ").append(seconds / 60).append(" MINUTES ")
                        .append(seconds % 60).append(" SECONDS.").toString();
            }

            return builder.append(seconds / 60).append(" MINUTES ").append(seconds % 60).append(" SECONDS.").toString();
        }
        else {
            return builder.append(seconds).append(" SECONDS.").toString();
        }

    }


    public static String getSize(File file) {

        if (file == null) return "0 KB";

        long kb = file.length() / 1024;

        if(kb >= 1024) {
            return (kb / 1024) + " MB";
        }

        return kb + " KB";

    }




}
