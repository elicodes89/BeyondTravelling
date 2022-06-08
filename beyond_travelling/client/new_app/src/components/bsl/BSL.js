import React, { useState, useEffect } from 'react';
import RegionList from './RegionList';
import ReactPlayer from 'react-player';
import { Card, Col, Row, Ratio, Container } from 'react-bootstrap';
import { alignProperty } from '@mui/material/styles/cssUtils';


const BSL = () => {
    const [regions, setRegions] = useState([]);


    useEffect(() => {
        getRegions();
    }, [])


    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))

    }

    function task(){
        console.log(getRegions)
    }
    setTimeout(task, 1000);
    
    return (
        <>
        <Row xs={'auto'} md={'auto'} className='hotel_card'>
        <Card>
            <Card.Body><RegionList regions = {regions}/></Card.Body>
        </Card>
        </Row>
        
        <br></br>
        <Card.Body>
        <div className='intro_video' style={{width: 700, height: 'auto'}}>
        <Ratio aspectRatio="16x9">
            <ReactPlayer 
            url={"https://www.youtube.com/watch?v=swyWGfjBbAA"}
            controls={true}/>
        </Ratio>
        </div>
        </Card.Body>
        </>
      
    );
};

export default BSL;