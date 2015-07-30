package com.skbr.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="standard")
public class Standard implements Calculator {

}
