package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

//класс который будет инжектить в viewModel
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
