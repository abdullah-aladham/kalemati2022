 import React from "react";
import "bootstrap/dist/css/bootstrap.min.css"
import * as Icon from 'react-bootstrap-icons';


const DropdownProfile= () =>{
    return (
        <div className='flex flex-col dropDownProfile'>
      
        <div className='flex flex-col gap-4'>
          
        
            <ul>
            <li style={{listStyleType:'none'}}><Icon.Speedometer /> Dashboard</li>
          <li style={{listStyleType:'none'}}><Icon.Person /> profile</li>
            <li style={{listStyleType:'none'}}><Icon.Wrench /> settings</li>
              <li style={{listStyleType:'none'}}><Icon.BoxArrowRight /> Logout</li>
           </ul>
      
          </div>
        </div>
        
    )
}
 export default DropdownProfile