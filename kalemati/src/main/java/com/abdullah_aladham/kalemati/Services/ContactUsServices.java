package com.abdullah_aladham.kalemati.Services;

import com.abdullah_aladham.kalemati.Exceptions.ContactNotFoundException;
import com.abdullah_aladham.kalemati.Model.ContactUs;
import com.abdullah_aladham.kalemati.Repo.ContactUsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ContactUsServices {
    private ContactUsRepo contactUsRepo;

    public ContactUs addContact( ContactUs contactUs){
        contactUs.setCardCode(UUID.randomUUID().toString());
        return contactUsRepo.save(contactUs);

    }
    public List<ContactUs> findAllContactUs(){
        return contactUsRepo.findAll();
    }
    public ContactUs findById(Long Id){
        return contactUsRepo.findContactUsById(Id).orElseThrow(()->new ContactNotFoundException("the ContactUs record that you looking for is not found"));

    }
    public ContactUs UpdateContactUs(ContactUs contactUs){
        return contactUsRepo.save(contactUs);
    }
    public void DeleteContactUs(Long Id){
        contactUsRepo.deleteById(Id);
    }
}
