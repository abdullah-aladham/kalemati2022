import React, { useState } from 'react';
import "./sidebar.css";
import * as Icon from "react-bootstrap-icons";
import "bootstrap-icons/font/bootstrap-icons.css"
// import NavbarCollapse from 'react-bootstrap/esm/NavbarCollapse';
const Sidebarmenu = () => {
    // const [isExpended, setExpendState] =useState(false);
let [navCollapse,setNavCollapse]=useState(false);
    return (
        // <div className='side-nav-container'>
        //     <div className='nav-upper'>
        //         <div className='nav-heading'>
        //             <div className='nav-brand'>
        //                 <img src='src\images\kalemati-brand.svg'/>
        //                 <h2>Kalemati</h2>
        //             </div>
        //             <button className={isExpended?'hamburger hamburger-in':"hamburger hamburger-out"}
        //             onClick={() => setExpendState(isExpended)}
        //             >
        //                 <span></span>
        //             </button>
        //         </div>
        //     </div>
        // </div>
        // <div className='container'>
        //     <nav className='nav'>
        //         <h2>Kalemati</h2>
        //         <ul>
        //             <li>Home</li>
        //             <li>My profile</li>
        //             <li>logout</li>

        //         </ul>
        //     </nav>
            <div className='sidebar-content'>
                <i className='bi bi-justify' onClick={e=>setNavCollapse(!navCollapse)}></i>
            <div className={`sidebar-container ${navCollapse ? "navCollapse":""}`}>
                <div className='nav-option option1'>
                    <Icon.HouseFill className='icon1'/>
                    <span>Homepage</span>
                </div>
                <div className='nav-option option1'>
                    <Icon.PersonCircle className='icon1'/>
                    <span>My Profile</span>
                </div>
               
                <div className='nav-option option1'>
                    <Icon.CardImage className='icon1'/>
                    <span>My Cards</span>
                </div>
                <div className='nav-option option1'>
                    <Icon.Heart className='icon1'/>
                    <span>Recommended</span>
                </div>
            </div>
            </div>
        // </div>
        );

};

export default Sidebarmenu;