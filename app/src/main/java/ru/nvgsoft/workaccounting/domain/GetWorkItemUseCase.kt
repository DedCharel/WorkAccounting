package ru.nvgsoft.workaccounting.domain

class GetWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun getWorkItem(workId: Int){
        repository.getWorkItem(workId)
    }
}