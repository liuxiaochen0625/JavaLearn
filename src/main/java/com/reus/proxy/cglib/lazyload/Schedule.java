/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.proxy.cglib.lazyload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author reus
 * @version $Id: Schedule.java, v 0.1 2018-03-28 reus Exp $
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    private String courseName;

    private Date courseTime;

}