import React, { Component } from 'react';
import { MDBInput, MDBCheckbox, MDBBtn,MDBTextArea, MDBCardTitle } from 'mdb-react-ui-kit';
import Footer from '../footer';
import Header from '../SharedElements/Header';
import Table from 'react-bootstrap/Table';
import Kalemati from '../kalemati';


class ClassRoom extends Component {
    render() {
        return (
            <>
    <Header />
    <Table striped bordered hover >
        <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Age</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>john</td>
                <td>M</td>
                <td>4</td>
            </tr>
        </tbody>
    </Table>
    <h2> Packages to use in class room</h2>
    <Kalemati />
    <Footer/>
            </>
        );
    }
}

export default ClassRoom;