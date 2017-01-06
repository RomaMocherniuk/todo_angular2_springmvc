package com.ss.angular2springmvc.service;

import com.ss.angular2springmvc.mock.TaskMock;
import com.ss.angular2springmvc.model.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rmochetc on 05.01.2017.
 */

@Service("taskService")
@Transactional
public class TaskService {


    public List<Task> getAll(){
        return TaskMock.getTasks();
    }

    public void addTask(Task task){
        System.out.println("SERVICE ADD WORK");

        TaskMock.addTask(task);
    }

    public void updateTask(Task task){
        TaskMock.updateTask(task);
    }

    public void deleteTask(long id){
        TaskMock.delete(id);
    }

    public Task getById(long id){
        return TaskMock.getById(id);
    }

}
