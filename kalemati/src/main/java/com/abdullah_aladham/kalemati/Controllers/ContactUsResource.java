package com.abdullah_aladham.kalemati.Controllers;

import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Model.ContactUs;
import com.abdullah_aladham.kalemati.Services.ContactUsServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Contact/")
@AllArgsConstructor
public class ContactUsResource {
private ContactUsServices contactUsServices;

    @GetMapping("/all/{id}")
    public ResponseEntity<ContactUs> getRequestsById(Long id){
        ContactUs res =contactUsServices.findById(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ContactUs> addRequest(@RequestBody ContactUs contact){
        ContactUs newReq =contactUsServices.addContact(contact);
        return new ResponseEntity<>(newReq,HttpStatus.CREATED);

    }
    @PostMapping("/update")
    public ResponseEntity<ContactUs> updateRequest(@RequestBody ContactUs contact){
        ContactUs updatedContact =contactUsServices.UpdateContactUs(contact);
        return new ResponseEntity<>(updatedContact,HttpStatus.CREATED);

    }
    @DeleteMapping("/delete")
    public ResponseEntity<ContactUs>deleteCard(@PathVariable("id")Long id){
        contactUsServices.DeleteContactUs(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
