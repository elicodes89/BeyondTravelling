import React, { useState, useEffect } from 'react';
import HotelList from './HotelList';
import ReactPlayer from 'react-player';
import { Card, Col, Row } from 'react-bootstrap';

// import PlayVideo from './PlayVideo';

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
        <Row xs={4} md={1} className='hotel_card'>
        <Card>
            <Card.Body><HotelList regions = {regions}/></Card.Body>
        </Card>
        </Row>
        {/* <Col xs={1} md={4} className="g-4">
        {Array.from({ length: 1 }).map((_, idx) => (
          <Row>
            <Card>
              <Card.Body>
                <Card.Title>Card title</Card.Title>
                <Card.Text> */}
                {/* <HotelList regions = {regions}/> */}
                {/* </Card.Text>
              </Card.Body>
            </Card>
          </Row>
        ))}
      </Col>
        <div className="main-container">
            {/* <HotelList regions = {regions}/> */}
        {/* </div>   */} 
        <br></br>
        <div className='intro_video'>
            <ReactPlayer url={"https://www.youtube.com/watch?v=swyWGfjBbAA"}
                controls={true}/>
            </div>
        </>
      
    );
};

export default BSL;