package ru.nvgsoft.workaccounting.domain.work

class GetWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun getWorkItem(workId: Int){
        repository.getWorkItem(workId)
    }
}