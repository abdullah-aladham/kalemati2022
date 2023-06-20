import React from 'react';
import Sidebarmenu from '../sidebarmenu/sidebarmenu';

const Header =()=>{
    return(

        <div className='container'>

 <div className="mb-2 position-absolute top-0 start-0"> 
<Sidebarmenu/>
</div>
    <h1 style={{textAlign: 'center',color: '#F6B968'}}>Kalemati | كـلماتي </h1>
    



  </div>
    );
}



export default Header;