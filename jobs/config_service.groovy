multibranchPipelineJob('config-service') {
    branchSources {
        git {
            id('bootifulmicropizza-config-service')
            remote('https://github.com/bootifulmicropizza/config-service')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}