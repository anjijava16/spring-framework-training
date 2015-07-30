package com.skbr.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="scientific")
public class Scientific implements Calculator {

}
