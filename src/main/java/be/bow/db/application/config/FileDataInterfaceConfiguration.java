package be.bow.db.application.config;

import be.bow.db.application.environment.FileCountDBEnvironmentProperties;
import be.bow.application.file.OpenFilesManager;
import be.bow.application.memory.MemoryManager;
import be.bow.cache.CachesManager;
import be.bow.db.DataInterfaceFactory;
import be.bow.db.filedb.FileDataInterfaceFactory;
import be.bow.virtualfile.VirtualFileService;
import be.bow.virtualfile.local.LocalFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class FileDataInterfaceConfiguration {

    @Bean
    @Autowired
    public DataInterfaceFactory dataInterfaceFactory(OpenFilesManager openFilesManager, CachesManager cachesManager, MemoryManager memoryManager, FileCountDBEnvironmentProperties environmentProperties) {
        return new FileDataInterfaceFactory(openFilesManager, cachesManager, memoryManager, environmentProperties.getDataDirectory() + "server/");
    }

    @Bean
    @Autowired
    public VirtualFileService virtualFileService(FileCountDBEnvironmentProperties environmentProperties) {
        return new LocalFileService(environmentProperties.getDataDirectory() + "virtualFiles/");
    }

}
