package org.tarena.note.controller.note;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tarena.note.entity.NoteResult;
import org.tarena.note.service.NoteService;

@Controller
@RequestMapping("/note")
public class AddNoteController {
	
	@Resource
	private NoteService noteService;
	@RequestMapping("/add.do")
	@ResponseBody
	public NoteResult execute(String noteTitle,String bookId,String userId){
		NoteResult result = noteService.addNote(noteTitle,bookId,userId);
		return result;
	}
}
