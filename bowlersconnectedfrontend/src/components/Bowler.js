import * as React from 'react';
import {useState} from "react";
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container,Paper,Button } from '@material-ui/core';

export default function Bowler() {
    const paperStyle={padding:"50px 20px", width:600,margin:"20px auto"}
    const[name,setName]=useState("")
    const[average,setAverage]=useState("")

    const handleClick=(e)=>{
        e.preventDefault()
        const bowler={name,average}
        console.log(bowler)
    }

  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
        <h1 style={{color:"blue"}}>Add Bowler</h1>
            <Box
            component="form"
            sx={{
                '& > :not(style)': { m: 1 },
            }}
            Validate
            autoComplete="off"
            >
            <TextField id="outlined-basic" label="Bowler Name" variant="outlined" fullWidth
            value={name}
            onChange={(e)=>setName(e.target.value)}/>
            <TextField id="outlined-basic" label="Bowler Average" variant="outlined" fullWidth 
            type="number"
            min="0"
            max="300"
            value={average}
            onChange={(e)=>setAverage(e.target.value)}/>
            <Button variant="contained" color="secondary" onClick={handleClick}>
                Submit
            </Button>
            </Box>
        </Paper>
    </Container>
  );
}
