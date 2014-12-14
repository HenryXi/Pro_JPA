package c422manyToManyJoinTable.model.stateless;

import java.util.Collection;

import c422manyToManyJoinTable.model.Project422;

public interface ProjectService422 {
    public Project422 createProject(String name);
    public Collection<Project422> findAllProjects();
}
