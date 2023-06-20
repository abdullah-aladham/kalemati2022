import React from 'react';
// import Header from '../SharedElements/Header';
import Header from '../SharedElements/Header';
import Footer from '../footer';
import { Card ,Button} from 'react-bootstrap';
import "../css/kalemati.css";
import { Link } from 'react-router-dom';
//import Kalemati from '../kalemati';



    const KalematiPage = () =>{
return(
    <>
    <Header />
<div className='container'>
    <div className='gallery'>
        <div className='gallery'>
            {/* <img src={require("../sample1.jpg")}  alt="jweijgw"/>
            gkkgk */}
            <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
            <Button variant="primary"><Link to="./Pages/PackageView" className='Link'> Discover Cards</Link></Button>
            </Card>
        </div>
    </div>
</div>
<Footer/>
</>
)
    }


export default KalematiPage;