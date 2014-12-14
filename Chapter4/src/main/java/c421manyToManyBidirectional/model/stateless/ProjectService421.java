package c421manyToManyBidirectional.model.stateless;

import c421manyToManyBidirectional.model.Project421;

import java.util.Collection;


public interface ProjectService421 {
    public Project421 createProject(String name);
    public Collection<Project421> findAllProjects();
}
