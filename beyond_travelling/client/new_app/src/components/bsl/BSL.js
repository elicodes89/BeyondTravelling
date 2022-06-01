import React, { useState, useEffect } from 'react';
// import HotelList from '../components/bsl/HotelList';
// import HotelDetail from '../components/bsl/HotelDetail';
// import HotelDetail from '../components/wheelchair/HotelDetail';
// import HotelList from '../components/wheelchair/HotelList';
// import AccessibleHotels from '../components/wheelchair/AccessibleHotels';
// import ReactPlayer from 'react-player';
import video from '/Users/annikaneumann/codeclan_work/BeyondTravelling/beyond_travelling/client/new_app/src/caption_videos/HomepageIntroCC.mp4'


const BSL = () => {
    const [region, setRegions] = useState([]);
    const [selectedRegion, setSelectedRegion] = useState(null);

    // const [videoFilePath, setVideoFilePath] = useState(null);

    // const handleVideoUpload = (event) =>{
    //     setVideoFilePath(URL.createObjectURL(event.target.files[0]))
    // };

    useEffect(() => {
        getRegions();
    }, [])



    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))
    }

    const onRegionClick = function(region){
        setSelectedRegion(region);
    }

    // const onHotelSelected = function(hotel){
    //     setSelectedHotel(hotel);
    // }
    

    return (
        // <div>
        <div className="main-container">
            {/* <HotelList regions={region} onRegionClick={onRegionClick} />
            {selectedRegion ? <HotelDetail selectedRegion={selectedRegion} /> : null}
            <AccessibleHotels /> */}

            {/* <input type="video" onChange={handleVideoUpload} /> */}

            <video width="750" height="500" controls autoPlay muted>
            <source src={video} type="video/mp4"/>
            </video>

            {/* added React Player Component, which renders global url path, but not local path yet */}

            {/* <ReactPlayer  */}
            {/* width='600px'
            height='400px'
            controls={true}
            url={HotelOffersWifiCC}
            onReady={() => console.log('onReady callback')}
            onStart={() => console.log('onStart callback')}
            onPause={() => console.log('onPause callback')}
            onEnded={() => console.log('onEnded callback')}
            /> */}
            </div>
        
    )
};

export default BSL;


// sources tried out / trial and console.error(
//     https://stackoverflow.com/tags/react-player/info
//     https://stackoverflow.com/questions/51830864/how-to-play-video-in-react-js-using-html-video-tag
// https://stackoverflow.com/questions/41729408/why-can-i-not-get-a-react-html5-video-component-to-play
// );