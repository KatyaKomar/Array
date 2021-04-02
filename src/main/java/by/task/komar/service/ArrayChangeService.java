package by.task.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;

public interface ArrayChangeService {

    void changePositiveElements(EntityArray array) throws ArrayException;

    void changeNegativeElements(EntityArray array) throws ArrayException;
}
