package dbt.todo_test_task.config;

import dbt.todo_test_task.entity.Todo;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;

import javax.swing.text.html.parser.Entity;


@Configuration
public class MyEntityProcessor implements RepresentationModelProcessor<EntityModel<Todo>> {

    @Override
    public EntityModel<Todo> process(EntityModel<Todo> model){

        return EntityModel.of(model.getContent());

    }

}
